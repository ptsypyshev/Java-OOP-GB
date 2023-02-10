package models

import (
	"fmt"
)

// Hen structure
type Stork struct {
	Bird
	flightAltitude int
}

// Creates new Hen instance with full parameters given
func NewStork(height float64, weight float64, eyeColor string, feathersColor string, flightAltitude int) (*Stork, error) {
	b, err := newBird(height, weight, eyeColor, feathersColor)
	if err != nil {
		return nil, err
	}

	s := &Stork{
		*b,
		flightAltitude,
	}

	// Handles potential restrictions of any parameter to return error when new Stork cannot be instantiated
	return s, nil
}

// Returns sound of Stork
func (s *Stork) Sound() string {
	return fmt.Sprint(".....")
}

// Trains the dog
func (d *Stork) Fly() string {
	return fmt.Sprintf("I'm flying at %d meters", d.flightAltitude);
}

// Returns the string representation of Stork instance
func (s *Stork) String() string {
	return fmt.Sprintf("Stork %v, Flight Altitude: %d", s.Bird.String(), s.flightAltitude)
}
