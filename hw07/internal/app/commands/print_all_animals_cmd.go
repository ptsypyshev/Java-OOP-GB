package commands

import (
	"errors"
	"fmt"

	p "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/parameters"
	v "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/views"
	e "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/errors"
	m "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/models"
)

type PrintAllAnimalsCommand struct {
	BaseActionCommand
}

func NewPrintAllAnimalsCommand(view v.View, zoo *m.Zoo) *PrintAllAnimalsCommand {
	bac := NewBaseActionCommand(view, zoo)
	return &PrintAllAnimalsCommand{
		*bac,
	}
}

func (c *PrintAllAnimalsCommand) Execute(parameter p.Parameter) {
	if err := c.Validation(parameter); err != nil  && errors.Is(err, e.NewZooIsEmptyError()){
		c.PrintMessage(fmt.Sprintf("%s\n", err))
		return
	}

	c.PrintAnimals(c.Animals())
}

func (c *PrintAllAnimalsCommand) String() string {
	return fmt.Sprint("Print information about all the animals in the zoo")
}
