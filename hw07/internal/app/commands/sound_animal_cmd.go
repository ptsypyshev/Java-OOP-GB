package commands

import (
	"fmt"

	p "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/parameters"
	v "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/views"
	m "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/models"
)

type SoundAnimalCommand struct {
	BaseActionCommand
}

func NewSoundAnimalCommand(view v.View, zoo *m.Zoo) *SoundAnimalCommand {
	bac := NewBaseActionCommand(view, zoo)
	return &SoundAnimalCommand{
		*bac,
	}
}

func (c *SoundAnimalCommand) Execute(parameter p.Parameter) {
	if err := c.Validation(parameter); err != nil {
		c.PrintMessage(fmt.Sprintf("%s\n", err))
		return
	}

	animal, err := c.Animal(parameter.GetValue())
	if err != nil {
		c.PrintMessage(err.Error())
		return
	}
	c.SoundAnimal(animal)
}

func (c *SoundAnimalCommand) String() string {
	return fmt.Sprint("Make a sound of specific animal")
}
