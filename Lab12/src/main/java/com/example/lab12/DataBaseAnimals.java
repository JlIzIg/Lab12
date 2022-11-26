package com.example.lab12;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

import static java.sql.DriverManager.getConnection;

public class DataBaseAnimals { //NOPMD - suppressed AtLeastOneConstructor - TODO explain reason for suppression

    private Connection connection; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    private ObservableList<Animal> data; //NOPMD - suppressed CommentRequired - TODO explain reason for suppression

    /**
     * сеттер для Connection
     */
    public void setConnection(Connection connection) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.connection = connection;
    }

    public ObservableList<Animal> getData() {
        return data;
    }

    /**
     * сеттер для Data
     */
    public void setData(ObservableList<Animal> data) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.data = data;
    }

    /**
     * метод соединения с БД
     */

    @SuppressWarnings("Java9ReflectionClassVisibility")
    public boolean dbConnection(String conn, String login, String password) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        boolean result = false; //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) { //NOPMD - suppressed AvoidCatchingGenericException - TODO explain reason for suppression
            Logger.getLogger(e.getMessage());
        }
        try {
            String url = "jdbc:mysql://" + conn; //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
            Properties properties = new Properties(); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
            properties.setProperty("user", login);
            properties.setProperty("password", password);
            properties.setProperty("serverTimezone", "UTC");
            properties.setProperty("useSSL", "false");
            properties.setProperty("autoReconnect", "true");
            connection = getConnection(url, properties);
            result = true;
            setConnection(connection);
        } catch (SQLException e) {
            Logger.getLogger(e.getMessage());
        }
        return result;
    }

    /**
     * метод агрузки данных
     **/
    public void loadData() {
        try {
            data = FXCollections.observableArrayList();
            Statement statement = connection.createStatement(); //NOPMD - suppressed CloseResource - TODO explain reason for suppression
            ResultSet resultSet; //NOPMD - suppressed CloseResource - TODO explain reason for suppression
            resultSet = statement.executeQuery("select * from amimals;"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            while (resultSet.next()) { //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
                data.add(new Animal(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("latinName"), resultSet.getString("animalType"), resultSet.getString("activeTime"), resultSet.getDouble("lenMin"), resultSet.getDouble("lenMax"), resultSet.getDouble("wgMin"), resultSet.getDouble("wgMax"), resultSet.getDouble("lifespan"), resultSet.getString("habitat"), resultSet.getString("diet"), resultSet.getString("geoRange"), resultSet.getString("imageLink"))); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            }
            setData(data);
            resultSet.close(); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            statement.close(); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        } catch (SQLException e) {
            Logger.getLogger(e.getMessage());
        }

    }

    /**
     * метод удаления последней записи
     */
    @SuppressWarnings("RedundantThrows")
    public void delete() throws SQLException {
        String deleteString = "delete from amimals where id = (select x.id from (select max(t.id) as id  from amimals t) x);"; //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        try {
            Statement statement = connection.createStatement(); //NOPMD - suppressed CloseResource - TODO explain reason for suppression
            ResultSet resultSet = statement.executeQuery("select * from amimals;"); //NOPMD - suppressed CloseResource - TODO explain reason for suppression
            PreparedStatement preparedStatement = connection.prepareStatement(deleteString); //NOPMD - suppressed CloseResource - TODO explain reason for suppression
            preparedStatement.executeUpdate(); //for delete in DB //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            resultSet.close(); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            statement.close(); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        } catch (SQLException e) {
            Logger.getLogger(e.getMessage());
        }
    }

    /**
     * метод добавления в БД
     */
    @SuppressWarnings({"SpellCheckingInspection", "RedundantSuppression"})
    public void addData() {

        String name;
        String latinName;
        String animalType;
        String activeTime;
        Double lenMin;
        Double lenMax;
        Double wgMin;
        Double wgMax;
        Double lifespan;
        String habitat;
        String diet;
        String geoRange;
        String imageLink;
        try {
            Animals animals = new Animals(); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
            Animal animal = animals.getRandomAnimal(); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
            name = animal.getName(); //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
            latinName = animal.getLatinName(); //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
            animalType = animal.getAnimalType(); //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
            activeTime = animal.getActiveTime(); //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
            lenMin = animal.getLenMin(); //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
            lenMax = animal.getLenMax(); //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
            wgMin = animal.getWgMin(); //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
            wgMax = animal.getWgMax(); //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
            lifespan = animal.getLifespan(); //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
            habitat = animal.getHabitat(); //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
            diet = animal.getDiet(); //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
            geoRange = animal.getGeoRange(); //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
            imageLink = animal.getImageLink(); //NOPMD - suppressed DataflowAnomalyAnalysis - TODO explain reason for suppression
        } catch (Exception e) { //NOPMD - suppressed AvoidCatchingGenericException - TODO explain reason for suppression
            Logger.getLogger(e.getMessage());
            return;
        }
        try {
            Statement statement = connection.createStatement(); //NOPMD - suppressed CloseResource - TODO explain reason for suppression
            ResultSet resultSet = statement.executeQuery("select * from amimals;"); //NOPMD - suppressed CloseResource - TODO explain reason for suppression
            PreparedStatement preparedStatement = connection.prepareStatement("insert into amimals(name, latinName, animalType, activeTime, lenMin, lenMax, wgMin, wgMax, lifespan, habitat, diet, geoRange, imageLink) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"); //NOPMD - suppressed CloseResource - TODO explain reason for suppression
            preparedStatement.setString(1, name); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            preparedStatement.setString(2, latinName); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            preparedStatement.setString(3, animalType); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            preparedStatement.setString(4, activeTime); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            preparedStatement.setDouble(5, lenMin); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            preparedStatement.setDouble(6, lenMax); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            preparedStatement.setDouble(7, wgMin); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            preparedStatement.setDouble(8, wgMax); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            preparedStatement.setDouble(9, lifespan); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            preparedStatement.setString(10, habitat); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            preparedStatement.setString(11, diet); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            preparedStatement.setString(12, geoRange); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            preparedStatement.setString(13, imageLink); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            preparedStatement.executeUpdate(); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            resultSet.close(); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
            statement.close(); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        } catch (SQLException e) {
            Logger.getLogger(e.getMessage());
        }
    }

    /**
     * закрытие подключения к бд
     **/
    public void close() throws SQLException {
        this.connection.close();
    }
}