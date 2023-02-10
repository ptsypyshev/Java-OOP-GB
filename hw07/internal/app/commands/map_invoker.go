package commands

type MapInvoker struct {
	commands map[int]Command
}

func NewMapInvoker() *MapInvoker {
	return &MapInvoker{
		make(map[int]Command),
	}
}

func (i *MapInvoker) GetCommand(key int) (val Command, ok bool) {
	val, ok = i.commands[key]
	return
}

func (i *MapInvoker) GetCommands() map[int]Command {
	return i.commands
}

func (i *MapInvoker) SetCommand(key int, val Command) bool {
	i.commands[key] = val

	// Handles potential different status of SetCommand
	return true
}
