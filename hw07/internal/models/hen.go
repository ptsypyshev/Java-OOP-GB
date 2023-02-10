package models

import (
	"fmt"
)

// Hen structure
type Hen struct {
	Bird
}

// Creates new Hen instance with full parameters given
func NewHen(height float64, weight float64, eyeColor string, feathersColor string) (*Hen, error) {
	b, err := newBird(height, weight, eyeColor, feathersColor)
	if err != nil {
		return nil, err
	}

	h := &Hen{
		*b,
	}

	// Handles potential restrictions of any parameter to return error when new Hen cannot be instantiated
	return h, nil
}

// Returns sound of hen
func (h *Hen) Sound() string {
	return fmt.Sprint("Cluck-cluck!")
}

// Returns the string representation of Hen instance
func (h *Hen) String() string {
	return fmt.Sprintf("Hen %v", h.Bird.String())
}
