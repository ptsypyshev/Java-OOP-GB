package main

import (
	"log"

	c "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/commands"
	p "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/presenters"
	m "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/models"
	"github.com/ptsypyshev/Java-OOP-GB/hw07/internal/ui"
)

func main() {
	view := ui.NewConsoleUI()
	zoo, err := m.NewEmptyZoo()
	if err != nil {
		log.Fatalln(err)
	}

	invoker := c.NewMapInvoker()
	invoker.SetCommand(1, c.NewAddAnimalCommand(view, zoo))
	invoker.SetCommand(2, c.NewRemoveAnimalCommand(view, zoo))
	invoker.SetCommand(3, c.NewPrintAnimalCommand(view, zoo))
	invoker.SetCommand(4, c.NewPrintAllAnimalsCommand(view, zoo))
	invoker.SetCommand(5, c.NewSoundAnimalCommand(view, zoo))
	invoker.SetCommand(6, c.NewSoundAllAnimalsCommand(view, zoo))
	invoker.SetCommand(7, c.NewFlyAnimalCommand(view, zoo))
	invoker.SetCommand(8, c.NewPetAnimalCommand(view, zoo))
	invoker.SetCommand(9, c.NewTrainAnimalCommand(view, zoo))
	invoker.SetCommand(0, c.NewExitCommand(view))

	presenter := p.NewPresenter(view, invoker)
	presenter.Run()
}
