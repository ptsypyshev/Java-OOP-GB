package views

import m "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/models"

type AnimalActions interface {
	PrintAnimal(animal m.Animalable)
	PrintAnimals(animals []m.Animalable)
	SoundAnimal(animal m.Animalable)
	SoundAnimals(animals []m.Animalable)
	FlyAnimal(animal m.Flyable)
	PetAnimal(animal m.Petable)
	TrainAnimal(animal m.Trainable)
}