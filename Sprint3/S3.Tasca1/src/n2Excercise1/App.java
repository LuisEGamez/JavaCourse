package n2Excercise1;



public class App {
    public static void main(String[] args) {



        AbstractFactory agendaFactory = FactoryProducer.getFactory("agenda");
        Agenda interAgenda = agendaFactory.getAgenda();

        AbstractFactory adressFactory = FactoryProducer.getFactory("adress");
        Adress adress = adressFactory.getAdress("Luis","rue Paris","15", "","58745", "Paris", "France");
        Adress adress1 = adressFactory.getAdress("Marie","rue Lala","10", "4-2","55745", "Lion", "France");
        Adress adress2 = adressFactory.getAdress("Joan","rue Tete","11", "","58745", "Brussels", "Belgium");
        Adress adress3 = adressFactory.getAdress("Lili","place Le Gran","1", "5-1","58995", "Brugges", "Belgium");

        AbstractFactory phoneNumberFactory = FactoryProducer.getFactory("phonenumber");

        PhoneNumber number1 = phoneNumberFactory.getPhoneNumber("Luis","0258746985", "France");
        PhoneNumber number2 = phoneNumberFactory.getPhoneNumber("Marie","0258743385", "France");
        PhoneNumber number3 = phoneNumberFactory.getPhoneNumber("Joan","0459946985", "Belgium");
        PhoneNumber number4 = phoneNumberFactory.getPhoneNumber("Lili","0459333985", "Belgium");


        interAgenda.addAdress(adress.createAdress());
        interAgenda.addAdress(adress1.createAdress());
        interAgenda.addAdress(adress2.createAdress());
        interAgenda.addAdress(adress3.createAdress());
        interAgenda.addPhoneNumber(number1.createPhoneNumber());
        interAgenda.addPhoneNumber(number2.createPhoneNumber());
        interAgenda.addPhoneNumber(number3.createPhoneNumber());
        interAgenda.addPhoneNumber(number4.createPhoneNumber());

        interAgenda.listContacts();




    }
}
