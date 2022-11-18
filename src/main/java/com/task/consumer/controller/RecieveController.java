package com.task.consumer.controller;



import com.task.consumer.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecieveController {


    public String hello(@RequestBody String product) {
//
//        Logger log = LoggerFactory.getLogger(RecieveController.class);
//
//        try {
//            System.out.println("service class line 28");
//            //   Unirest.setTimeouts(10000, 60000);
//            HttpResponse<String> response1 = Unirest.get()
//                    .header("Content-Type", "application/json")
//                    .body("{\n    \"ID\" :\"" + product.getName() +   "\"\n}")
//                    .asString();
//            System.out.println("service class line 36");
//            log.info("Response From mcg for msisdn is   " +  product.getName());
//
//
//        } catch (UnirestException e) {
//            log.info("Exception Sending message: "+e.getMessage() +" for id "+product.getName());
//
//            e.printStackTrace();
//            return "error occured";
//        }
//        return "Success";
//
//    }
        System.out.println(product);
        return product;

    }
    @PostMapping("/show")
    public String getProductAsJson(@RequestBody Product product) {
        System.out.println(product.getName());
        return "sucess";
    }
}
