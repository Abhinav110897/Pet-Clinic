package PetClinic.bootstrap;

import model.Owner;
import model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.OwnerService;
import services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }
    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new Owner();
        owner1.setFirstName("Bruce");
        owner1.setLastName("Wayne");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setFirstName("Clarke");
        owner2.setLastName("Kent");

        ownerService.save(owner2);

        System.out.println("Loaded Owners.........");

        Vet vet1 = new Vet();
        //vet1.setId(1L);
        vet1.setFirstName("Barry");
        vet1.setLastName("Allen");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        //vet2.setId(2L);
        vet2.setFirstName("Diana");
        vet2.setLastName("Prince");

        vetService.save(vet2);

        System.out.println("Loaded vets........");
    }
}
