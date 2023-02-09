package presenters

import (
	"fmt"
	"sort"

	c "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/commands"
	param "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/parameters"
	v "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/views"
	msg "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/messages"
)

const (
	DEFAULT_CMD = iota - 1
	ZERO
)

type Presenter struct {
	v.View
	c.Invoker
}

func NewPresenter(view v.View, invoker c.Invoker) *Presenter {
	return &Presenter{
		view,
		invoker,
	}
}

func (p *Presenter) Run() {
	cmdNumber := DEFAULT_CMD

	p.PrintMessage(msg.WELCOME_MSG)
	for cmdNumber != ZERO {
		p.MainMenu()
		cmdNumber = p.GetInt(msg.GET_COMMAND_MSG)

		if cmd, ok := p.GetCommand(cmdNumber); ok {
			cmd.Execute(*param.NewParameter(cmdNumber, p.View))
		}
	}
	p.PrintMessage(msg.BYE_MSG)
}

func (p *Presenter) MainMenu() {
	commands := p.GetCommands()
	keys := make([]int, 0, len(commands))
	for k := range commands {
		keys = append(keys, k)
	}
	sort.Ints(keys)
	for i := 1; i < len(keys); i++ {
		p.PrintMessage(fmt.Sprintf("%d - %v\n", i, commands[i]))
	}
	if cmd, ok := p.GetCommand(0); ok {
		p.PrintMessage(fmt.Sprintf("0 - %v\n", cmd))
	}
}
