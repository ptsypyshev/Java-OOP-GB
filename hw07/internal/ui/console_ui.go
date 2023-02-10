package ui

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
	"time"

	m "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/models"
)

type ConsoleUI struct {
}

func NewConsoleUI() *ConsoleUI {
	return &ConsoleUI{}
}

func (c *ConsoleUI) PrintMessage(msg string) {
	fmt.Print(msg)
}

func (c *ConsoleUI) PrintAnimal(animal m.Animalable){
	fmt.Println(animal)
	fmt.Println()
}
func (c *ConsoleUI) PrintAnimals(animals []m.Animalable){
	for idx, animal := range animals {
		fmt.Printf("%d - %v\n", idx, animal)
	}
	fmt.Println()
}
func (c *ConsoleUI) SoundAnimal(animal m.Animalable){
	fmt.Println(animal.Sound())
	fmt.Println()
}
func (c *ConsoleUI) SoundAnimals(animals []m.Animalable){
	for _, animal := range animals {
		fmt.Println(animal.Sound())
	}
	fmt.Println()
}
func (c *ConsoleUI) FlyAnimal(animal m.Flyable){
	fmt.Println(animal.Fly())
	fmt.Println()
}

func (c *ConsoleUI) PetAnimal(animal m.Petable){
	fmt.Println(animal.PetMe())
	fmt.Println()
}

func (c *ConsoleUI) TrainAnimal(animal m.Trainable){
	fmt.Println(animal.Train())
	fmt.Println()
}

func (c *ConsoleUI) GetInt(msg string) int {	
	for {
		userInput := c.GetString(msg)
		result, err := strconv.Atoi(userInput)
		if err == nil {
			return result
		}
		c.PrintMessage(fmt.Sprintf("%s\n", err))
	}
}
func (c *ConsoleUI) GetDouble(msg string) float64{
	for {
		userInput := c.GetString(msg)
		result, err := strconv.ParseFloat(userInput, 64)
		if err == nil {
			return result
		}
		c.PrintMessage(fmt.Sprintf("%s\n", err))
	}
}
func (c *ConsoleUI) GetString(msg string) string{
	reader := bufio.NewReader(os.Stdin)
	for {
		c.PrintMessage(msg)
		line, err := reader.ReadString('\n')
		if err != nil {
			c.PrintMessage(fmt.Sprintf("%s\n", err))
			continue
		}
		return strings.TrimSpace(line)
	}
}

func (c *ConsoleUI) GetBoolean(msg string) bool{
	for {
		userInput := c.GetString(msg)
		if (strings.ToLower(userInput) == "y") {
            return true;
        }
        return false;
	}
}
func (c *ConsoleUI) GetDate(msg string) time.Time{
	for {
		userInput := c.GetString(msg)
		parseTime, err := time.Parse("2006-01-02", userInput)
		if err == nil {
			return parseTime
		}
		c.PrintMessage(err.Error())
	}
}
func (c *ConsoleUI) GetListString(msg string) []string{
	userInput := c.GetString(msg)
	return strings.Fields(userInput)


	// var line string
	// fmt.Scanln(&line)
	// for {
	// 	c.PrintMessage(msg)
	// 	_, err := fmt.Scanln(&line)
	// 	if err != nil {
	// 		c.PrintMessage(err.Error())
	// 		continue
	// 	}
	// 	return strings.Fields(line)
	// }
}