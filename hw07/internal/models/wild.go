package models

import (
	"fmt"
	"time"
)

// Wild animal base structure
type Wild struct {
	Animal
	habitat   string
	foundDate time.Time
}

// Creates new Wild instance with full parameters given
func newWild(height float64, weight float64, eyeColor string, habitat string, foundDate time.Time) (*Wild, error) {
	a, err := newAnimal(height, weight, eyeColor)
	if err != nil {
		return nil, err
	}

	w := &Wild{
		*a,
		habitat,
		foundDate,
	}

	// Handles potential restrictions of any parameter to return error when new Pet cannot be instantiated
	return w, nil
}

// Returns the wild's habitat
func (w *Wild) Habitat() string {
	return w.habitat
}

// Returns the wild's found date
func (w *Wild) FoundDate() time.Time {
	return w.foundDate
}

// Returns the string representation of Pet instance
func (w *Wild) String() string {
	return fmt.Sprintf("%v, Habitat: %s, FoundDate: %s",
		w.Animal.String(), w.habitat, w.foundDate.Format("02-01-2006"))
}
