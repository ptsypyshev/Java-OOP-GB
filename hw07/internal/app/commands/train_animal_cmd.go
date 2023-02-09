package commands

import (
	"fmt"

	p "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/parameters"
	v "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/views"
	m "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/models"
	msg "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/messages"
)

type TrainAnimalCommand struct {
	BaseActionCommand
}

func NewTrainAnimalCommand(view v.View, zoo *m.Zoo) *TrainAnimalCommand {
	bac := NewBaseActionCommand(view, zoo)
	return &TrainAnimalCommand{
		*bac,
	}
}

func (c *TrainAnimalCommand) Execute(parameter p.Parameter) {
	if err := c.Validation(parameter); err != nil {
		c.PrintMessage(err.Error())
		return
	}

	animal, err := c.Animal(parameter.GetValue())
	if err != nil {
		c.PrintMessage(err.Error())
		return
	}
	
	if t, ok := animal.(m.Trainable); ok {
		c.TrainAnimal(t)
		return
	}

	c.PrintMessage(msg.CANNOT_TRAIN_MSG)

	// switch animal.(type) {
	// case m.Trainable:
	// 	c.TrainAnimal(animal.(m.Trainable))
	// default:
	// 	c.PrintMessage(msg.CANNOT_PET_MSG)
	// }
}

func (c *TrainAnimalCommand) String() string {
	return fmt.Sprint("Try animal to train")
}
