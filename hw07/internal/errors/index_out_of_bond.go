package errors

import "fmt"

// IndexOutOfBondError with datetime information
type IndexOutOfBondError struct {
	idx    int
	length int
}

func NewIndexOutOfBondError(idx int, length int) error {
	return &IndexOutOfBondError{
		idx: idx,
		length: length,
	}
}

// Error representation
func (e *IndexOutOfBondError) Error() string {
	return fmt.Sprintf("Index %d is out of bond (0...%d)", e.idx, e.length - 1)
}
