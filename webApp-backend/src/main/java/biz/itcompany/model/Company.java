package biz.itcompany.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "company", schema = "dbo")
public class Company {

    @Id
    @Column(name = "company_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companyId;

    @Column(name = "company_name", nullable = false)
    @NotNull(message = "Поле \"Наименование компании\" не может быть пустым")
    @Size(max=30, message = "Поле \"Наименование компании\" не может содержать больше {max} символов")
    private String companyName;

    @Column(name = "company_legalcity", nullable = false)
    @NotNull(message = "Поле \"Юридический адрес - город\" не может быть пустым")
    @Size(max=20, message = "Поле \"Юридический адрес - город\" не может содержать больше {max} символов")
    private String companyLegalCity;

    @Column(name = "company_legalstreet", nullable = false)
    @NotNull(message = "Поле \"Юридический адрес - улица\" не может быть пустым")
    @Size(max=30, message = "Поле \"Юридический адрес - улица\" не может содержать больше {max} символов")
    private String companyLegalStreet;

    @Column(name = "company_legalhouse", nullable = false)
    @NotNull(message = "Поле \"Юридический адрес - дом\" не может быть пустым")
    @Size(max=5, message = "Поле \"Юридический адрес - дом\" не может содержать больше {max} символов")
    private String companyLegalHouse;

    @Column(name = "company_actualcity", nullable = false)
    @NotNull(message = "Поле \"Фактический адрес - город\" не может быть пустым")
    @Size(max=20, message = "Поле \"Юридический адрес - город\" не может содержать больше {max} символов")
    private String companyFactCity;

    @Column(name = "company_actualstreet", nullable = false)
    @NotNull(message = "Поле \"Фактический адрес - улица\" не может быть пустым")
    @Size(max=30, message = "Поле \"Юридический адрес - улица\" не может содержать больше {max} символов")
    private String companyFactStreet;

    @Column(name = "company_actualhouse", nullable = false)
    @NotNull(message = "Поле \"Фактический адрес - дом\" не может быть пустым")
    @Size(max=5, message = "Поле \"Юридический адрес - дом\" не может содержать больше {max} символов")
    private String companyFactHouse;

    @Column(name = "worker_id", nullable = false)
    @NotNull(message = "Поле \"Директор\" не может быть пустым")
    private Integer workerId;

    @Column(name = "company_phonenumber", nullable = false)
    @NotNull(message = "Поле \"Телефон компании\" не может быть пустым")
    @Size(max=11, message = "Поле \"Телефон компании\" не может содержать больше {max} символов")
    private String companyPhoneNumber;

    public Company() {
    }

    public Company(Integer companyId,
                   String companyName,
                   String companyLegalCity,
                   String companyLegalStreet,
                   String companyLegalHouse,
                   String companyFactCity,
                   String companyFactStreet,
                   String companyFactHouse,
                   Integer workerId,
                   String companyPhoneNumber) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyLegalCity = companyLegalCity;
        this.companyLegalStreet = companyLegalStreet;
        this.companyLegalHouse = companyLegalHouse;
        this.companyFactCity = companyFactCity;
        this.companyFactStreet = companyFactStreet;
        this.companyFactHouse = companyFactHouse;
        this.workerId = workerId;
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyLegalCity() {
        return companyLegalCity;
    }

    public void setCompanyLegalCity(String companyLegalCity) {
        this.companyLegalCity = companyLegalCity;
    }

    public String getCompanyLegalStreet() {
        return companyLegalStreet;
    }

    public void setCompanyLegalStreet(String companyLegalStreet) {
        this.companyLegalStreet = companyLegalStreet;
    }

    public String getCompanyLegalHouse() {
        return companyLegalHouse;
    }

    public void setCompanyLegalHouse(String companyLegalHouse) {
        this.companyLegalHouse = companyLegalHouse;
    }

    public String getCompanyFactCity() {
        return companyFactCity;
    }

    public void setCompanyFactCity(String companyFactCity) {
        this.companyFactCity = companyFactCity;
    }

    public String getCompanyFactStreet() {
        return companyFactStreet;
    }

    public void setCompanyFactStreet(String companyFactStreet) {
        this.companyFactStreet = companyFactStreet;
    }

    public String getCompanyFactHouse() {
        return companyFactHouse;
    }

    public void setCompanyFactHouse(String companyFactHouse) {
        this.companyFactHouse = companyFactHouse;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }
}
