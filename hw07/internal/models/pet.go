package models

import (
	"fmt"
	"time"
)

// Pet base structure
type Pet struct {
	Animal
	name         string
	breed        string
	vaccinations []string
	furColor     string
	birthDate    time.Time
}

// Creates new Pet instance with full parameters given
func newPet(height float64, weight float64, eyeColor string, name string, breed string, vaccinations []string, furColor string, birthDate time.Time) (*Pet, error) {
	a, err := newAnimal(height, weight, eyeColor)
	if err != nil {
		return nil, err
	}

	p := &Pet{
		*a,
		name,
		breed,
		vaccinations,
		furColor,
		birthDate,
	}

	// Handles potential restrictions of any parameter to return error when new Pet cannot be instantiated
	return p, nil
}

// Returns the pet's name
func (p *Pet) Name() string {
	return p.name
}

// Returns the pet's breed
func (p *Pet) Breed() string {
	return p.breed
}

// Returns the pet's vaccinations list
func (p *Pet) Vaccinations() []string {
	return p.vaccinations
}

// Returns the pet's fur color
func (p *Pet) FurColor() string {
	return p.furColor
}

// Returns the pet's birth date
func (p *Pet) BirthDate() time.Time {
	return p.birthDate
}

// Pets the pet
func (p *Pet) PetMe() string {
	return fmt.Sprintf("%s has been petted. It loves you)", p.name)
}

// Returns the string representation of Pet instance
func (p *Pet) String() string {
	return fmt.Sprintf("%v, Name: %s, Breed: %s, Vaccinations: %s, Fur color: %s, Birth date: %s",
		p.Animal.String(), p.name, p.breed, p.vaccinations, p.furColor, p.birthDate.Format("02-01-2006"))
}
