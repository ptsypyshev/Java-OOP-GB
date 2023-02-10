package models

import (
	"fmt"
	"time"
)

// Dog structure
type Dog struct {
	Pet
	trained bool
}

// Creates new Dog instance with full parameters given
func NewDog(height float64, weight float64, eyeColor string, name string, breed string, vaccinations []string, furColor string, birthDate time.Time, trained bool) (*Dog, error) {
	p, err := newPet(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate)
	if err != nil {
		return nil, err
	}

	c := &Dog{
		*p,
		trained,
	}

	// Handles potential restrictions of any parameter to return error when new Dog cannot be instantiated
	return c, nil
}

// Returns the is dog trained
func (d *Dog) IsTrained() bool {
	return d.trained
}

// Trains the dog
func (d *Dog) Train() string {
	d.trained = true
	return fmt.Sprintf("%s is trained", d.name)
}

// Returns sound of dog
func (d *Dog) Sound() string {
	return fmt.Sprint("Woof-woof!")
}

// Returns the string representation of Dog instance
func (d *Dog) String() string {
	return fmt.Sprintf("Dog %v, is trained: %t", d.Pet.String(), d.trained)		
}