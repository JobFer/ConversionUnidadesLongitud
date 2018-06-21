package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ConversionUnidadesLongitudWS")
public class ConversionUnidadesLongitudWS {

    @WebMethod(operationName = "pulgadasACentimetros")
    public Double pulgadasACentimetros(@WebParam(name = "pulgadas") Double pulgadas) {
        return pulgadas *2.54;
    }

    @WebMethod(operationName = "centimetrosAPulgadas")
    public Double centimetrosAPulgadas(@WebParam(name = "centimetros") Double centimetros) {
        return centimetros / 2.54;
    }
}
