package views

import "time"

type InputChecker interface {
	GetInt(msg string) int
	GetDouble(msg string) float64
	GetString(msg string) string
	GetBoolean(msg string) bool
	GetDate(msg string) time.Time
	GetListString(msg string) []string
}