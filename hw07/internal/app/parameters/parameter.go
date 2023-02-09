package parameters

import (
	v "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/views"
	msg "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/messages"
)

type Parameter struct {
	val   int
	empty bool
}

func NewParameter(cmd int, view v.View) *Parameter {
	switch cmd {
	case 2, 3, 5, 7, 8, 9:
		val:= view.GetInt(msg.GET_ANIMAL_ID_MSG)
		return &Parameter{
			val:   val,
			empty: false,
		}
	default:
		return &Parameter{
			val:   0,
			empty: true,
		}
	}
}

func (p *Parameter) GetValue() int {
	return p.val
}

func (p *Parameter) IsEmpty() bool {
	return p.empty
}
