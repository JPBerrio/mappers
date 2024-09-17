package org.example.modelmapper.mapstruct.dto;

public class PersonCustomDTO {

    private Long idDTO;
    private String nameDTO;
    private String lastNameDTO;
    private Byte ageDTO;
    private Character genderDTO;

    public PersonCustomDTO() {
    }

    public PersonCustomDTO(Long idDTO, String nameDTO, String lastNameDTO, Byte ageDTO, Character genderDTO) {
        this.idDTO = idDTO;
        this.nameDTO = nameDTO;
        this.lastNameDTO = lastNameDTO;
        this.ageDTO = ageDTO;
        this.genderDTO = genderDTO;
    }

    public Long getIdDTO() {
        return idDTO;
    }

    public void setIdDTO(Long idDTO) {
        this.idDTO = idDTO;
    }

    public String getNameDTO() {
        return nameDTO;
    }

    public void setNameDTO(String nameDTO) {
        this.nameDTO = nameDTO;
    }

    public String getLastNameDTO() {
        return lastNameDTO;
    }

    public void setLastNameDTO(String lastNameDTO) {
        this.lastNameDTO = lastNameDTO;
    }

    public Byte getAgeDTO() {
        return ageDTO;
    }

    public void setAgeDTO(Byte ageDTO) {
        this.ageDTO = ageDTO;
    }

    public Character getGenderDTO() {
        return genderDTO;
    }

    public void setGenderDTO(Character genderDTO) {
        this.genderDTO = genderDTO;
    }

    @Override
    public String toString() {
        return "PersonCustomDTO{" +
                "idDTO=" + idDTO +
                ", nameDTO='" + nameDTO + '\'' +
                ", lastNameDTO='" + lastNameDTO + '\'' +
                ", ageDTO=" + ageDTO +
                ", genderDTO=" + genderDTO +
                '}';
    }
}
