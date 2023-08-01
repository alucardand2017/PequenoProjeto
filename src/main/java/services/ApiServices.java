package services;

import java.security.InvalidParameterException;

public class ApiServices {
    public static String urlViaCep(String cep){
        String cepLimpo = cep.replace("-","");
        boolean validaCep = validacaoCep(cepLimpo);
        if(validaCep)
            return ("https://viacep.com.br/ws/"+cepLimpo+"/json/");
        else
            throw new InvalidParameterException("Digite apenas numeros válidos!") ;
    }

    private static boolean validacaoCep(String cepLimpo) {
        return !cepLimpo.matches("ˆ[0-9]") && cepLimpo.matches("\\d{8}");
    }
}
