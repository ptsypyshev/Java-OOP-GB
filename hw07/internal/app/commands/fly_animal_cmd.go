package commands

import (
	"fmt"

	p "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/parameters"
	v "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/views"
	m "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/models"
	msg "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/messages"
)

type FlyAnimalCommand struct {
	BaseActionCommand
}

func NewFlyAnimalCommand(view v.View, zoo *m.Zoo) *FlyAnimalCommand {
	bac := NewBaseActionCommand(view, zoo)
	return &FlyAnimalCommand{
		*bac,
	}
}

func (c *FlyAnimalCommand) Execute(parameter p.Parameter) {
	if err := c.Validation(parameter); err != nil {
		c.PrintMessage(err.Error())
		return
	}

	animal, err := c.Animal(parameter.GetValue())
	if err != nil {
		c.PrintMessage(err.Error())
		return
	}

	if t, ok := animal.(m.Flyable); ok {
		c.FlyAnimal(t)
		return
	}

	c.PrintMessage(msg.CANNOT_FLY_MSG)
}

func (c *FlyAnimalCommand) String() string {
	return fmt.Sprint("Try animal to fly")
}
