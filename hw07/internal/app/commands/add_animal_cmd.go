package commands

import (
	"fmt"

	p "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/parameters"
	v "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/app/views"
	m "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/models"
    msg "github.com/ptsypyshev/Java-OOP-GB/hw07/internal/messages"
)

type AddAnimalCommand struct {
	BaseActionCommand
}

func NewAddAnimalCommand(view v.View, zoo *m.Zoo) *AddAnimalCommand {
	bac := NewBaseActionCommand(view, zoo)
	return &AddAnimalCommand{
		*bac,
	}
}

func (c *AddAnimalCommand) Execute(parameter p.Parameter) {
        c.PrintMessage(msg.ADD_NEW_ANIMAL_MSG)
        animalType := c.GetInt(msg.ASK_ANIMAL_CLASS_MSG)
        height := c.GetDouble(msg.ASK_ANIMAL_HEIGHT_MSG)
        weight := c.GetDouble(msg.ASK_ANIMAL_WEIGHT_MSG)
        eyeColor := c.GetString(msg.ASK_ANIMAL_EYE_COLOR_MSG)
        switch (animalType) {
            case 1, 2:
                name := c.GetString(msg.ASK_PET_NAME_MSG)
                breed := c.GetString(msg.ASK_PET_BREED_MSG)
                vaccinations := c.GetListString(msg.ASK_PET_VACCINATIONS_MSG)
                furColor := c.GetString(msg.ASK_PET_FUR_COLOR_MSG)
                birthDate := c.GetDate(msg.ASK_PET_BIRTH_DATE_MSG)
                if (animalType == 1) {
                    woolly := c.GetBoolean(msg.ASK_IS_CAT_WOOLLY_MSG)
                    c.Add(m.NewCat(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate, woolly))
                    c.PrintMessage(msg.ANIMAL_WAS_ADDED_MSG)
                    return 
                }
                trained := c.GetBoolean(msg.ASK_IS_DOG_TRAINED_MSG)
                c.Add(m.NewDog(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate, trained))
                c.PrintMessage(msg.ANIMAL_WAS_ADDED_MSG)
                return
            case 3, 4:
                habitat := c.GetString(msg.ASK_WILD_ANIMAL_HABITAT_MSG)
                foundDate := c.GetDate(msg.ASK_WILD_ANIMAL_FOUND_DATE_MSG)
                if (animalType == 3) {
                    c.Add(m.NewTiger(height, weight, eyeColor, habitat, foundDate))
                    c.PrintMessage(msg.ANIMAL_WAS_ADDED_MSG)
                    return 
                }
                leader := c.GetBoolean(msg.ASK_IS_WOLF_LEADERD_MSG)
                c.Add(m.NewWolf(height, weight, eyeColor, habitat, foundDate, leader))
                c.PrintMessage(msg.ANIMAL_WAS_ADDED_MSG)
                return 
            case 5, 6:
                feathersColor := c.GetString(msg.ASK_BIRD_FEATHERS_COLOR_MSG)
                if (animalType == 5) {
                    c.Add(m.NewHen(height, weight, eyeColor, feathersColor))
                    c.PrintMessage(msg.ANIMAL_WAS_ADDED_MSG)
                    return
                }
                flightAltitude := c.GetInt(msg.ASK_BIRD_FLIGHT_ALTITUDE_MSG)
                c.Add(m.NewStork(height, weight, eyeColor, feathersColor, flightAltitude))
                c.PrintMessage(msg.ANIMAL_WAS_ADDED_MSG)
                return
            default:
                c.PrintMessage(msg.NOT_IMPLEMENTED_MSG)
                return
        }
}

func (c *AddAnimalCommand) String() string {
	return fmt.Sprint("Add new animal to zoo")
}