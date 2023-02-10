package commands

import (
	"fmt"

	p "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/parameters"
	v "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/views"
)

type ExitCommand struct {
	BaseCommand
}

func NewExitCommand(view v.View) *ExitCommand {
	bc := NewBaseCommand(view)
	return &ExitCommand{
		*bc,
	}
}

func (c *ExitCommand) Execute(parameter p.Parameter) {
}

func (c *ExitCommand) String() string {
	return fmt.Sprint("Quit from Golang Zoo")
}
