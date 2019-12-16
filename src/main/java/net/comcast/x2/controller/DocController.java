package net.comcast.x2.controller;

import net.comcast.x2.models.Doc;
import net.comcast.x2.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/docs")
public class DocController
{
    @Autowired
    private DocService docService;

    @GetMapping(value = "/docs",
                produces = {"application/json"})
    public ResponseEntity<?> listAllDocs()
    {
        List<Doc> myList = docService.findall();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

}
