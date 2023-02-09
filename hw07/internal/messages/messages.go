package views

const (
	WELCOME_MSG        = "Welcome to Golang Zoo!\n\n"
	BYE_MSG            = "Bye!\n"
	CHOOSE_ACTIONS_MSG = "Choose one of next actions:"
	ADD_NEW_ANIMAL_MSG     = `You've chosen to add new animal (see what types it can be)
1 - Cat
2 - Dog
3 - Tiger
4 - Wolf
5 - Hen
6 - Stork
`

	ASK_ANIMAL_CLASS_MSG           = "What is its type? "
	ASK_ANIMAL_HEIGHT_MSG          = "What is its height? "
	ASK_ANIMAL_WEIGHT_MSG          = "What is its weight? "
	ASK_ANIMAL_EYE_COLOR_MSG        = "What is its eye color? "
	ASK_PET_NAME_MSG               = "What is its name? "
	ASK_PET_BREED_MSG              = "What is its breed? "
	ASK_PET_VACCINATIONS_MSG       = "What vaccinations does it have (space separated)? "
	ASK_PET_FUR_COLOR_MSG          = "What is its fur color? "
	ASK_PET_BIRTH_DATE_MSG         = "What is its birth date (format yyyy-mm-dd)? "
	ASK_WILD_ANIMAL_HABITAT_MSG    = "What is its habitat? "
	ASK_WILD_ANIMAL_FOUND_DATE_MSG = "What is its found date (format yyyy-mm-dd)? "
	ASK_BIRD_FEATHERS_COLOR_MSG    = "What is its feathers color? "
	ASK_BIRD_FLIGHT_ALTITUDE_MSG   = "What is its flight altitude? "
	ASK_IS_DOG_TRAINED_MSG         = "Is the dog trained (answer y / n)? "
	ASK_IS_WOLF_LEADERD_MSG        = "Is the wolf leader (answer y / n)? "
	ASK_IS_CAT_WOOLLY_MSG          = "Is the cat woolly (answer y / n)? "

	GET_COMMAND_MSG       = "Enter command number: "
	GET_ANIMAL_ID_MSG     = "Enter animal ID: "
	INVALID_ANIMAL_ID_MSG = "Invalid animal ID\n\n"
	INCORRECT_INPUT_MSG   = "This is not a valid answer, try again!\n\n"
	CANNOT_DO_IT_MSG      = "Cannot do it (invalid animal id)\n\n"

	ANIMAL_WAS_ADDED_MSG   = "This animal was added to zoo\n\n"
	ANIMAL_NOT_ADDED_MSG   = "This animal was not added to zoo\n\n"
	NOBODY_REMOVED_MSG     = "Nobody was removed from zoo (invalid animal id)\n\n"
	ANIMAL_WAS_REMOVED_MSG = "Animal was removed from zoo\n\n"

	NOBODY_LIVES_IN_ZOO_MSG = "Nobody lives in zoo yet\n\n"
	NOT_IMPLEMENTED_MSG     = "It is not implemented yet\n\n"

	CANNOT_FLY_MSG   = "The animal cannot fly... Sorry\n\n"
	CANNOT_PET_MSG   = "The animal cannot be petted... Sorry\n\n"
	CANNOT_TRAIN_MSG = "The animal cannot be trained... Sorry\n\n"

	// public static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
	//         entry(1, "Add new animal to zoo"),
	//         entry(2, "Remove an animal from zoo"),
	//         entry(3, "Print information about a specific animal"),
	//         entry(4, "Print information about all the animals in the zoo"),
	//         entry(5, "Make a sound of specific animal"),
	//         entry(6, "Make sounds of all the animals in the zoo"),
	//         entry(7, "Try animal to fly"),
	//         entry(8, "Try animal to pet"),
	//         entry(9, "Try animal to train"),
	//         entry(0, "Quit from Java Zoo"))
)
