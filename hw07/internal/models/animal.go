package models

import "fmt"

// Animal base structure
type Animal struct {
	height   float64
	weight   float64
	eyeColor string
}

// Creates new Animal instance
func newAnimal(height float64, weight float64, eyeColor string) (*Animal, error) {
	a := &Animal{
		height:   height,
		weight:   weight,
		eyeColor: eyeColor,
	}

	// Handles potential restrictions of any parameter to return error when new Animal cannot be instantiated
	return a, nil
}

// Returns the animal height
func (a *Animal) Height() float64 {
	return a.height
}

// Returns the animal weight
func (a *Animal) Weight() float64 {
	return a.weight
}

// Returns the animal eyeColor
func (a *Animal) EyeColor() string {
	return a.eyeColor
}

// Returns the string representation of Animal instance
func (a *Animal) String() string {
	return fmt.Sprintf("Height: %.1f, Height: %.1f, Eye color: %s", a.height, a.weight, a.eyeColor)
}
