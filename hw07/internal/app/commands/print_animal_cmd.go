package commands

import (
	"fmt"

	p "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/parameters"
	v "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/views"
	m "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/models"
)

type PrintAnimalCommand struct {
	BaseActionCommand
}

func NewPrintAnimalCommand(view v.View, zoo *m.Zoo) *PrintAnimalCommand {
	bac := NewBaseActionCommand(view, zoo)
	return &PrintAnimalCommand{
		*bac,
	}
}

func (c *PrintAnimalCommand) Execute(parameter p.Parameter) {
	if err := c.Validation(parameter); err != nil {
		c.PrintMessage(fmt.Sprintf("%s\n", err))
		return
	}

	animal, err := c.Animal(parameter.GetValue())
	if err != nil {
		c.PrintMessage(fmt.Sprintf("%s\n", err))
		return
	}
	c.PrintAnimal(animal)
}

func (c *PrintAnimalCommand) String() string {
	return fmt.Sprint("Print information about a specific animal")
}
