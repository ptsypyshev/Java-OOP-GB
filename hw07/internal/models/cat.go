package models

import (
	"fmt"
	"time"
)

// Cat structure
type Cat struct {
	Pet
	woolly bool
}

// Creates new Cat instance with full parameters given
func NewCat(height float64, weight float64, eyeColor string, name string, breed string, vaccinations []string, furColor string, birthDate time.Time, woolly bool) (*Cat, error) {
	p, err := newPet(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate)
	if err != nil {
		return nil, err
	}

	c := &Cat{
		*p,
		woolly,
	}

	// Handles potential restrictions of any parameter to return error when new Cat cannot be instantiated
	return c, nil
}

// Returns the is cat woolly
func (c *Cat) IsWoolly() bool {
	return c.woolly
}

// Returns sound of cat
func (c *Cat) Sound() string {
	return fmt.Sprint("Meow-Meow")
}

// Returns the string representation of Cat instance
func (c *Cat) String() string {
	return fmt.Sprintf("Cat %v, is woolly: %t", c.Pet.String(), c.woolly)
}
