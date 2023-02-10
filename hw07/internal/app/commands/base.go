package commands

import (
	p "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/parameters"
	v "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/views"
	e "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/errors"
	m "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/models"
)

type Command interface {
	Execute(parameter p.Parameter)
	Validation(parameter p.Parameter) error
}

type Invoker interface {
	GetCommand(key int) (val Command, ok bool)
	SetCommand(key int, val Command) bool
	GetCommands() map[int]Command
}

type BaseCommand struct {
	v.View
}

func NewBaseCommand(view v.View) *BaseCommand {
	return &BaseCommand{
		view,
	}
}

func (c *BaseCommand) Validation(parameter p.Parameter) error {
	return nil
}

type BaseActionCommand struct {
	BaseCommand
	*m.Zoo
}

func NewBaseActionCommand(view v.View, zoo *m.Zoo) *BaseActionCommand {
	bc := NewBaseCommand(view)
	return &BaseActionCommand{
		*bc,
		zoo,
	}
}

func (c *BaseActionCommand) Validation(parameter p.Parameter) error {
	if c.IsZooEmpty() {
		return e.NewZooIsEmptyError()
	}

	if parameter.IsEmpty() {
		return e.NewParameterIsEmptyError()
	}
	return nil
}
