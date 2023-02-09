package models

import (
	"fmt"
	"time"
)

// Wolf structure
type Wolf struct {
	Wild
	leader bool
}

// Creates new Wolf instance with full parameters given
func NewWolf(height float64, weight float64, eyeColor string, habitat string, foundDate time.Time, leader bool) (*Wolf, error) {
	w, err := newWild(height, weight, eyeColor, habitat, foundDate)
	if err != nil {
		return nil, err
	}

	wolf := &Wolf{
		*w,
		leader,
	}

	// Handles potential restrictions of any parameter to return error when new Wolf cannot be instantiated
	return wolf, nil
}

// Returns true if the wolf is leader
func (w *Wolf) Leader() bool {
	return w.leader
}

// Returns sound of wolf
func (w *Wolf) Sound() string {
	return fmt.Sprint("Owooooo!")
}

// Returns the string representation of Wolf instance
func (w *Wolf) String() string {
	return fmt.Sprintf("Wolf %v", w.Wild.String())		
}