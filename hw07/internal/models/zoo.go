package models

import (
	// "fmt"

	"github.com/ptsypyshev/Java-OOP-GB/hw07/internal/errors"
)

const DEFAULT_ZOO_CAPACITY = 10


type Zoo struct {
	animals []Animalable
}

// Creates new Zoo instance
func NewZoo(animals []Animalable) (*Zoo, error) {
	z := &Zoo{
		animals,
	}

	// Handles potential restrictions of any parameter to return error when new Animal cannot be instantiated
	return z, nil
}

// Creates new empty Zoo instance
func NewEmptyZoo() (*Zoo, error) {
	z := &Zoo{
		make([]Animalable, 0, DEFAULT_ZOO_CAPACITY),
	}

	// Handles potential restrictions of any parameter to return error when new Animal cannot be instantiated
	return z, nil
}

// Returns animals list of Zoo
func (z *Zoo) Animals() []Animalable {
	// fmt.Println(len(z.animals), cap(z.animals))
	return z.animals
}

// Returns animals list of Zoo
func (z *Zoo) Animal(idx int) (Animalable, error) {
	zooSize := len(z.animals)
	if idx < 0 || idx >= len(z.animals) {
		return nil, errors.NewIndexOutOfBondError(idx, zooSize)
	}
	return z.animals[idx], nil
}

func (z *Zoo) Add(animal Animalable, err error) {
	z.animals = append(z.animals, animal)
	// fmt.Println(len(z.animals), cap(z.animals))
}

func (z *Zoo) Remove(idx int) (Animalable, error) {
	zooSize := len(z.animals)
	if idx < 0 || idx >= len(z.animals) {
		return nil, errors.NewIndexOutOfBondError(idx, zooSize)
	}
	removed := z.animals[idx]
	z.animals = append(z.animals[:idx], z.animals[idx + 1:]...)
	return removed, nil
}

func (z *Zoo) IsZooEmpty() bool {
	return len(z.animals) == 0
}