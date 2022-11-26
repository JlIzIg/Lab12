package com.example.lab12;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class AnimalsController implements Initializable { //NOPMD - suppressed AtLeastOneConstructor - TODO explain reason for suppression
    /**
     * инициализация элемента таблица
     **/
    @FXML
    public TableView<Animal> table1; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    @FXML
    public ChoiceBox<String> chooseFormat; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    @FXML
    public ChoiceBox<String> chooseAction; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки id**/
    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, Integer> id; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки name**/
    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, String> name; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки latinName**/
    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, String> latinName; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки animalType**/

    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, String> animalType; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки activeTime**/
    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, String> activeTime; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки lenMin**/
    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, Double> lenMin; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки lenMax**/
    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, Double> lenMax; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки wgMin**/
    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, Double> wgMin; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки wgMax**/
    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, Double> wgMax; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки lifespan**/
    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, Double> lifespan; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки habitat**/
    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, String> habitat; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки diet**/
    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, String> diet; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки geoRange**/
    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, String> geoRange; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***инициализация колонки imageLink**/
    @FXML //NOPMD - suppressed DefaultPackage - TODO explain reason for suppression
            TableColumn<Animal, String> imageLink; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /**
     * экземпляр класса DataBaseAnimals
     **/
    DataBaseAnimals dataBaseAnimals; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /**
     * кземпляр класса SaveAnimal
     **/
    SaveAnimal saveAnimal; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    /***поле connection*/
    @SuppressWarnings({"unused", "FieldCanBeLocal"}) //NOPMD - suppressed AvoidDuplicateLiterals - TODO explain reason for suppression
    //NOPMD - suppressed AvoidDuplicateLiterals - TODO explain reason for suppression
    private Connection connection; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression

    /**
     * заполнение таблицы данными
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void setTable1(@SuppressWarnings("rawtypes") ObservableList data) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        latinName.setCellValueFactory(new PropertyValueFactory<>("latinName"));
        animalType.setCellValueFactory(new PropertyValueFactory<>("animalType"));
        activeTime.setCellValueFactory(new PropertyValueFactory<>("activeTime"));
        lenMin.setCellValueFactory(new PropertyValueFactory<>("lenMin"));
        lenMax.setCellValueFactory(new PropertyValueFactory<>("lenMax"));
        wgMin.setCellValueFactory(new PropertyValueFactory<>("wgMin"));
        wgMax.setCellValueFactory(new PropertyValueFactory<>("wgMax"));
        lifespan.setCellValueFactory(new PropertyValueFactory<>("lifespan"));
        habitat.setCellValueFactory(new PropertyValueFactory<>("habitat"));
        diet.setCellValueFactory(new PropertyValueFactory<>("diet"));
        geoRange.setCellValueFactory(new PropertyValueFactory<>("geoRange"));
        imageLink.setCellValueFactory(new PropertyValueFactory<>("imageLink"));
        //noinspection unchecked
        table1.setItems(data);
    }

    /**
     * инициализация
     **/
    @Override
    public void initialize(URL location, ResourceBundle resources) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        connection = null; //NOPMD - suppressed NullAssignment - TODO explain reason for suppression
        dataBaseAnimals = new DataBaseAnimals();
        saveAnimal = new SaveAnimal();
        chooseFormat.getItems().addAll(".txt", ".json", ".xls"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        chooseFormat.setOnAction(this::getFormat);
        chooseAction.getItems().addAll("Connect to DB", "Load Data", "Add One Animal", "Exit"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        chooseAction.setOnAction(this::getAction);
    }

    /**
     * выбор действия с БД
     **/
    @SuppressWarnings("unused")
    public void getAction(ActionEvent event) { //NOPMD - suppressed LinguisticNaming - TODO explain reason for suppression

        String actionValue = chooseAction.getValue(); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        switch (actionValue) {
            case "Connect to DB":
                dataBaseAnimals.dbConnection(Constants.SERVER + "/mydb", "root", "NoFear@Dinar2021");
                break;
            case "Load Data":
                dataBaseAnimals.loadData();
                setTable1(dataBaseAnimals.getData());
                break;
            case "Add One Animal":
                dataBaseAnimals.addData();
                break;
            case "Exit":
                try {
                    dataBaseAnimals.close();
                } catch (SQLException |
                         RuntimeException e) { //NOPMD - suppressed AvoidCatchingGenericException - TODO explain reason for suppression
                    Logger.getLogger(e.getMessage());
                }
                break;
            default:
                break;

        }
    }

    /**
     * выбор формата
     */
    public void getFormat(@SuppressWarnings("unused") ActionEvent event) { //NOPMD - suppressed LinguisticNaming - TODO explain reason for suppression
        String formatValue = chooseFormat.getValue(); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        switch (formatValue) {
            case ".txt":
                try {
                    saveAnimal.saveToTxt();
                } catch (IOException | SQLException |
                         RuntimeException e) { //NOPMD - suppressed AvoidCatchingGenericException - TODO explain reason for suppression
                    Logger.getLogger(e.getMessage());
                }
                break;
            case ".json":
                try {
                    saveAnimal.saveToJson();
                } catch (IOException | SQLException |
                         RuntimeException e) { //NOPMD - suppressed AvoidCatchingGenericException - TODO explain reason for suppression
                    Logger.getLogger(e.getMessage());
                }
                break;
            case ".xls":
                try {
                    saveAnimal.saveToExcel();
                } catch (IOException | SQLException |
                         RuntimeException e) { //NOPMD - suppressed AvoidCatchingGenericException - TODO explain reason for suppression
                    Logger.getLogger(e.getMessage());
                }
                break;
            default:
                break;
        }
    }

    /**
     * удаление последней записи
     */
    @SuppressWarnings("unused")
    public void delete(ActionEvent actionEvent) throws SQLException { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        dataBaseAnimals.delete();
    }
}