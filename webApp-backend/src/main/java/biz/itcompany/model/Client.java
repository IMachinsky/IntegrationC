package biz.itcompany.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "client", schema = "dbo")
public class Client {

    public Client() {
    }

    @Id
    @Column(name = "client_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientId;

    @Column(name = "client_companyname", nullable = false)
    @NotNull(message = "Поле \"Имя компании\" не может быть пустым")
    @Size(max=30, message = "Поле \"Имя компании\" не может содержать больше {max} символов")
    private String clientCompanyName;

    @Column(name = "client_city")
    @NotNull(message = "Поле \"Город компании\" не может быть пустым")
    @Size(max=20, message = "Поле \"Город компании\" не может содержать больше {max} символов")
    private String clientCity;

    @Column(name = "client_street")
    @NotNull(message = "Поле \"Улица компании\" не может быть пустым")
    @Size(max=30, message = "Поле \"Улица компании\" не может содержать больше {max} символов")
    private String clientStreet;

    @Column(name = "client_house")
    @NotNull(message = "Поле \"Дом компании\" не может быть пустым")
    @Size(max=5, message = "Поле \"Дом компании\" не может содержать больше {max} символов")
    private String clientHouse;

    @Column(name = "client_phonenumber")
    @NotNull(message = "Поле \"Телефон компании\" не может быть пустым")
    @Size(max=11, message = "Поле \"Телефон компании\" не может содержать больше {max} символов")
    private String clientPhoneNumber;

    @Column(name = "client_email")
    @NotNull(message = "Поле \"E-mail сотрудника\" не может быть пустым")
    @Size(max=30, message = "Поле \"E-mail сотрудника\" не может содержать больше {max} символов")
    private String clientEmail;

    @Column(name = "client_lastname")
    @NotNull(message = "Поле \"Фамилия клиента\" не может быть пустым")
    @Size(max=20, message = "Поле \"Фамилия клиента\" не может содержать больше {max} символов")
    private String clientLastName;

    @Column(name = "client_name")
    @NotNull(message = "Поле \"Имя клиента\" не может быть пустым")
    @Size(max=20, message = "Поле \"Имя клиента\" не может содержать больше {max} символов")
    private String clientName;

    @Column(name = "client_middlename")
    @NotNull(message = "Поле \"Отчество клиента\" не может быть пустым")
    @Size(max=20, message = "Поле \"Отчество клиента\" не может содержать больше {max} символов")
    private String clientMiddleName;

    public Client(Integer clientId,
                  String clientCompanyName,
                  String clientCity,
                  String clientStreet,
                  String clientHouse,
                  String clientPhoneNumber,
                  String clientEmail,
                  String clientLastName,
                  String clientName,
                  String clientMiddleName) {
        this.clientId = clientId;
        this.clientCompanyName = clientCompanyName;
        this.clientCity = clientCity;
        this.clientStreet = clientStreet;
        this.clientHouse = clientHouse;
        this.clientPhoneNumber = clientPhoneNumber;
        this.clientEmail = clientEmail;
        this.clientLastName = clientLastName;
        this.clientName = clientName;
        this.clientMiddleName = clientMiddleName;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientCompanyName() {
        return clientCompanyName;
    }

    public void setClientCompanyName(String clientCompanyName) {
        this.clientCompanyName = clientCompanyName;
    }

    public String getClientCity() {
        return clientCity;
    }

    public void setClientCity(String clientCity) {
        this.clientCity = clientCity;
    }

    public String getClientStreet() {
        return clientStreet;
    }

    public void setClientStreet(String clientStreet) {
        this.clientStreet = clientStreet;
    }

    public String getClientHouse() {
        return clientHouse;
    }

    public void setClientHouse(String clientHouse) {
        this.clientHouse = clientHouse;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientMiddleName() {
        return clientMiddleName;
    }

    public void setClientMiddleName(String clientMiddleName) {
        this.clientMiddleName = clientMiddleName;
    }
}
