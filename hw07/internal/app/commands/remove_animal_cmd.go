package commands

import (
	"fmt"

	p "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/parameters"
	v "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/views"
	m "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/models"
	msg "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/messages"
)



type RemoveAnimalCommand struct {
	BaseActionCommand
}

func NewRemoveAnimalCommand(view v.View, zoo *m.Zoo) *RemoveAnimalCommand {
	bac := NewBaseActionCommand(view, zoo)
	return &RemoveAnimalCommand{
		*bac,
	}
}

func (c *RemoveAnimalCommand) Execute(parameter p.Parameter) {
	if err := c.Validation(parameter); err != nil {
		c.PrintMessage(fmt.Sprintf("%s\n", err))		
		return
	}

	if _, err := c.Remove(parameter.GetValue()); err != nil {
		c.PrintMessage(msg.NOBODY_REMOVED_MSG)
	} else {
		c.PrintMessage(msg.ANIMAL_WAS_REMOVED_MSG)
	}
}

func (c *RemoveAnimalCommand) String() string {
	return fmt.Sprint("Remove an animal from zoo")
}