package Celulares;

import funcionalidades.telefone.AppTelefone;
import funcionalidades.todas.DisponibilizarTodasFuncionalidades;

public class Celular{
    public static void main(String[] args) {
        DisponibilizarTodasFuncionalidades iphone = new DisponibilizarTodasFuncionalidades();
        iphone.atender();

        AppTelefone telefone = new AppTelefone();
        telefone.atender();
    }
}
