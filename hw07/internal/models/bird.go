package models

import "fmt"

// Bird base structure
type Bird struct {
	Animal
	feathersColor string
}

// Creates new Bird instance with full parameters given
func newBird(height float64, weight float64, eyeColor string, feathersColor string) (*Bird, error) {
	a, err := newAnimal(height, weight, eyeColor)
	if err != nil {
		return nil, err
	}

	b := &Bird{
		*a,
		feathersColor,
	}

	// Handles potential restrictions of any parameter to return error when new Bird cannot be instantiated
	return b, nil
}

// Returns the bird feathers color
func (b *Bird) FeathersColor() string {
	return b.feathersColor
}

// Returns the string representation of Animal instance
func (b *Bird) String() string {
	return fmt.Sprintf("%v, Feathers color: %s", b.Animal.String(), b.feathersColor)
}
