package errors

import (
	"fmt"

	msg "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/messages"
)

// ParameterIsEmptyError
type ParameterIsEmptyError struct {
	msg string
}

func NewParameterIsEmptyError() error {
	return &ParameterIsEmptyError{
		msg: msg.INVALID_ANIMAL_ID_MSG,
	}
}

// Error representation
func (e *ParameterIsEmptyError) Error() string {
	return fmt.Sprint(e.msg)
}

// Error Is Implementation
func (e *ParameterIsEmptyError) Is(target error) bool {
	if _, ok := target.(*ParameterIsEmptyError); !ok {
		return false
	}
	return true
}
