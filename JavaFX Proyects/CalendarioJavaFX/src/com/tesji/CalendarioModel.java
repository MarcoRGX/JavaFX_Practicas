package com.tesji;

public class CalendarioModel {
	private int dia, mes, año;
    public int diast, mest, añot;

    public String obtenerFecha() {
        boolean banda = true;

        if (año % 4 == 0) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) {
                if (dia < 31) {
                    diast = dia + 1;
                    mest = mes;
                    añot = año;
                } else if (dia == 31) {
                    diast = dia - 30;
                    mest = mes + 1;
                    añot = año;
                } else {
                    banda = false;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia < 30) {
                    diast = dia + 1;
                    mest = mes;
                    añot = año;
                } else if (dia == 30) {
                    diast = dia - 29;
                    mest = mes + 1;
                    añot = año;
                } else {
                    banda = false;
                }
            } else if (mes == 2) {
                if (dia < 29) {
                    diast = dia + 1;
                    mest = mes;
                    añot = año;
                } else if (dia == 29) {
                    diast = dia - 28;
                    mest = mes + 1;
                    añot = año;
                } else {
                    banda = false;
                }
            } else if (mes == 12) {
                diast = dia - 30;
                mest = mes - 11;
                añot = año + 1;
            } else {
                banda = false;
            }

        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) {
            if (dia < 31) {
                diast = dia + 1;
                mest = mes;
                añot = año;
            } else if (dia == 31) {
                diast = dia - 30;
                mest = mes + 1;
                añot = año;
            } else {
                banda = false;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 30) {
                diast = dia + 1;
                mest = mes;
                añot = año;
            } else if (dia == 30) {
                diast = dia - 29;
                mest = mes + 1;
                añot = año;
            } else {
                banda = false;
            }
        } else if (mes == 2) {
            if (dia < 28) {
                diast = dia + 1;
                mest = mes;
                añot = año;
            } else if (dia == 28) {
                diast = dia - 27;
                mest = mes + 1;
                añot = año;
            } else {
                banda = false;
            }
        } else if (mes == 12) {
            diast = dia - 30;
            mest = mes - 11;
            añot = año + 1;
        } else {
            banda = false;
        }
        if (banda) {
            return diast + "/" + mest + "/" + añot;
        } else {
            return "Fecha inExistente";
        }

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
