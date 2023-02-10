package errors

import (
	"fmt"

	msg "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/messages"
)

// IndexOutOfBondError with datetime information
type ZooIsEmptyError struct {
	msg string
}

func NewZooIsEmptyError() error {
	return &ZooIsEmptyError{
		msg: msg.NOBODY_LIVES_IN_ZOO_MSG,
	}
}

// Error representation
func (e *ZooIsEmptyError) Error() string {
	return fmt.Sprint(e.msg)
}

// Error Is Implementation
func (e *ZooIsEmptyError) Is(target error) bool {
	if _, ok := target.(*ZooIsEmptyError); !ok {
		return false
	}
	return true
}
