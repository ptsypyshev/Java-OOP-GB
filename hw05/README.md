Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
под форматами понимаем структуру файлов, например:
- в файле на одной строке хранится одна часть записи, пустая строка - разделитель


Contact -> Comparable
<!-- int ID -->
String name
List<Email> emails
List<PhoneNumber> phoneNumbers

Email
- String _email
- isValid()

PhoneNumber
- String _phoneNumber
- isValid()

PhoneBook 
<!-- static int idCounter; -->
Map<String,Contact> contacts

create(Contact);
get(idx);
get(name);
modify(idx, newContact)
delete(idx);
delete(name);
search(searchStr);

View
menu();
add();
read();
readAll();
edit();
delete();
search();

interface Importer
load();

ImportContactsTXT implements Importer
load();
ImportContactsCSV implements Importer
load();
ImportContactsXML implements Importer
load();

interface Exporter
save();

ExportContactsTXT implements Exporter
save();
ExportContactsCSV implements Exporter
save();
ExportContactsXML implements Exporter
save();

<!-- name;email;phone
vasya;vas@ya.ru;123 -->