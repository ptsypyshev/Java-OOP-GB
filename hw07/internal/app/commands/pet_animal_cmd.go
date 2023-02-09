package commands

import (
	"fmt"

	p "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/parameters"
	v "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/views"
	m "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/models"
	msg "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/messages"
)

type PetAnimalCommand struct {
	BaseActionCommand
}

func NewPetAnimalCommand(view v.View, zoo *m.Zoo) *PetAnimalCommand {
	bac := NewBaseActionCommand(view, zoo)
	return &PetAnimalCommand{
		*bac,
	}
}

func (c *PetAnimalCommand) Execute(parameter p.Parameter) {
	if err := c.Validation(parameter); err != nil {
		c.PrintMessage(err.Error())
		return
	}

	animal, err := c.Animal(parameter.GetValue())
	if err != nil {
		c.PrintMessage(err.Error())
		return
	}

	if t, ok := animal.(m.Petable); ok {
		c.PetAnimal(t)
		return
	}

	c.PrintMessage(msg.CANNOT_PET_MSG)
}

func (c *PetAnimalCommand) String() string {
	return fmt.Sprint("Try animal to pet")
}
