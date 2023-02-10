package commands

import (
	"errors"
	"fmt"

	p "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/parameters"
	v "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/views"
	e "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/errors"
	m "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/models"
)

type SoundAllAnimalsCommand struct {
	BaseActionCommand
}

func NewSoundAllAnimalsCommand(view v.View, zoo *m.Zoo) *SoundAllAnimalsCommand {
	bac := NewBaseActionCommand(view, zoo)
	return &SoundAllAnimalsCommand{
		*bac,
	}
}

func (c *SoundAllAnimalsCommand) Execute(parameter p.Parameter) {
	if err := c.Validation(parameter); err != nil && errors.Is(err, e.NewZooIsEmptyError()) {
		c.PrintMessage(fmt.Sprintf("%s\n", err))
		return
	}
	c.SoundAnimals(c.Animals())
}

func (c *SoundAllAnimalsCommand) String() string {
	return fmt.Sprint("Make sounds of all the animals in the zoo")
}
