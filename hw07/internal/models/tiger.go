package models

import (
	"fmt"
	"time"
)

// Tiger structure
type Tiger struct {
	Wild
}

// Creates new Tiger instance with full parameters given
func NewTiger(height float64, weight float64, eyeColor string, habitat string, foundDate time.Time) (*Tiger, error) {
	p, err := newWild(height, weight, eyeColor, habitat, foundDate)
	if err != nil {
		return nil, err
	}

	c := &Tiger{
		*p,
	}

	// Handles potential restrictions of any parameter to return error when new Tiger cannot be instantiated
	return c, nil
}

// Returns sound of tiger
func (t *Tiger) Sound() string {
	return fmt.Sprint("R-O-O-O-O-A-R-R-R-R!")
}

// Returns the string representation of Tiger instance
func (t *Tiger) String() string {
	return fmt.Sprintf("Tiger %v", t.Wild.String())		
}
