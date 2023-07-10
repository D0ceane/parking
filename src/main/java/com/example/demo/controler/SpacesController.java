package com.example.demo.controler;

import com.example.demo.repository.SpacesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Spaces;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SpacesController {
    private final SpacesRepository spacesRepository;
    @Autowired
    private SpacesController(SpacesRepository spacesRepository) {
        this.spacesRepository = spacesRepository;
    }

    @GetMapping("/spaces")
    @ResponseBody
    public List<Spaces> getAllSpaces() {
        return spacesRepository.findAll();
    }

    @GetMapping("/spaces/{id}")
    @ResponseBody
    public Spaces getByIdSpaces(@PathVariable Long id) {
        return spacesRepository.findById(id).orElseThrow();
    }
    @PostMapping("/spaces")
    public Spaces createSpaces(@RequestBody Spaces newSpaces) {
        return spacesRepository.save(newSpaces);
    }
}
