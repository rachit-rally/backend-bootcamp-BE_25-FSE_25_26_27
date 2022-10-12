package com.optum.providers.search.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.optum.providers.search.models.Address;
import com.optum.providers.search.models.Provider;


@Component
public class SearchRepositoryImpl implements SearchRepository{

    public Collection<Provider> getProviders() {

        List<Provider> providers=new ArrayList<Provider>();
          providers.add(new Provider(1,"Benjamin Morries D", "Family Practice" , new Address("750 W D Ave", "Kingman, KS 67068"), "(620) 532-3147",
                  Arrays.asList("Tier 1 Provider", "Accepting All Patients", "In-Network Provider"),
                  "Audiologist"));
          
          providers.add(new Provider(2,"Benjamin Barrah" , "Internal Medicine", new Address("103 N Maine", "StCheney, KS 67025"), "(620) 439-3241",
                  Arrays.asList("Tier 1 Provider", "In-Network Provider"),
                  "Cardiac Surgeon"));
          
          providers.add(new Provider(3,"Cherie MD", "Family Practice" , new Address("2653 W Ogden Ave Fl 3", "Chicago, IL 60608"), "(773) 522-6100",
                  Arrays.asList("Premium Care Physician", "In-Network Provider"),
                  "Family Practice"));
          
          providers.add(new Provider(4,"Saka Kazeem" , "Internal Medicine",new Address("30 N Michigan Ave Ste 1218", "Chicago, IL 60602"), "(312) 789-4677",
                  Arrays.asList("Premium Care Physician", "In-Network Provider"),
                 "Family Practice"));

          providers.add(new Provider(5,"Laboratory Corp of America Holdings", "Laboratory" , new Address("1st Ave At 16th St", "New York, NY 10003"), "(212) 844-1808",
                  Arrays.asList("Preferred Lab", "Designated Diagnostic Provider: Lab", "Freestanding Facility"),
                  "Laboratory"));
          providers.add(new Provider(6,"Quest Diagnostics", "Laboratory" ,new Address("750 W D Ave", "Kingman, KS 67068"), "(620) 532-3147",
                  Arrays.asList("Preferred Lab", "Designated Diagnostic Provider: Lab"),
                  "Laboratory"));
          providers.add(new Provider(7,"Mid America Clinical Laboratories", "Outpatient Diagnostic or Treatment Center" , new Address("381 Elden St Ste 1000", "Herndon, VA 20170"), "(703) 481-1505",
                  Arrays.asList("Preferred Lab", "Designated Diagnostic Provider: Lab", "Freestanding Facility"),
                  "Laboratory"));
          providers.add(new Provider(8,"Acl Laboratories", "Outpatient Diagnostic or Treatment Center" , new Address("60 Gramercy Park N Apt 1B", "New York, NY 10010"), "(212) 254-1220",
                  Arrays.asList("Preferred Lab", "Designated Diagnostic Provider: Lab", "Freestanding Facility"),
                  "Laboratory"));
          providers.add(new Provider(9,"Healthlab Part of Northwestern Medicine", "Laboratory" , new Address("3022 Williams Dr Ste 300", "Fairfax, VA 22031"), "(703) 573-9800",
                  Arrays.asList("Preferred Lab", "Designated Diagnostic Provider: Lab"),
                  "Laboratory"));
          
          providers.add(new Provider(10,"Simonmed Imaging", "X-ray and Radiology Facility" , new Address("675 N Saint Clair St Ste 18-200", "Chicago, IL 60611"), "(312) 695-8630",
                  Arrays.asList("Designated Diagnostic Provider: Imaging", "Freestanding Facility", "In-Network Provider"),
                  "X-ray & Radiology Facility"));
          providers.add(new Provider(11,"Polsono Mobile Ultrasound", "X-ray and Radiology Facility" , new Address("518 E 20th St", "New York, NY 10009"), "(646) 682-3555",
                  Arrays.asList("Designated Diagnostic Provider: Imaging", "In-Network Provider"),
                  "Radiology Facility"));
          providers.add(new Provider(12,"MRI Lincoln Imaging", "X-ray and Radiology Facility" , new Address("3430 Worthington Blvd Ste 103", "Frederick, MD 21704"), "(240) 215-6900",
                  Arrays.asList("Designated Diagnostic Provider: Imaging", "Freestanding Facility", "In-Network Provider"),
                  "MRI"));
          providers.add(new Provider(13,"NM Lab", "X-ray and Radiology Facility" , new Address("196 Merrick Rd ", "Oceanside, NY 11572"), "(516) 255-8400",
                  Arrays.asList("Designated Diagnostic Provider: Imaging", "In-Network Provider"),
                  "Radiology Facility"));
          providers.add(new Provider(14,"Molecular Imaging Chicago", "X-ray and Radiology Facility" ,new Address("676 N Saint Clair St Ste 415", "Chicago, IL 60611"), "(312) 926-3627",
                  Arrays.asList("Designated Diagnostic Provider: Imaging", "Freestanding Facility", "In-Network Provider"),
                  "Radiology Facility"));
          
          providers.add(new Provider(15,"Rehabcare Medical Group East KS" , "Ophthalmology", new Address("115 Park St SE Ste 205", "Vienna, VA 22180"), "(703) 255-9100",
                  Arrays.asList("Tier 1 Provider", "Premium Care Physician", "Accepting All Patients"),
                  "Physical Therapy"));
          providers.add(new Provider(16,"Wichita Medical Group" , "Internal Medicine", new Address("7137 N US Highway 1", "Cocoa, FL 32927"), "(321) 632-3500",
                  Arrays.asList("Tier 1 Provider", "Accepting All Patients", "In-Network Provider"),
                  "Family Practice"));
          providers.add(new Provider(17,"Maydew Medical Group" , "Cardiology", new Address("840 Executive Ln Ste 140", "Rockledge, FL 32955"), "(321) 751-7115",
                  Arrays.asList("Tier 1 Provider",  "Premium Care Physician","Accepting All Patients", "In-Network Provider"),
                  "Physical Therapy"));
          providers.add(new Provider(18,"Advanced Mobile Healthcare" , "Neurology",new Address("750 W D Ave", "Kingman, KS 67068"), "(620) 532-3147",
                  Arrays.asList("Tier 1 Provider", "Accepting All Patients", "In-Network Provider"),
                  "Family Practice"));
          providers.add(new Provider(19,"Center Forgynecology and Cosmetics" , "Pediatrics", new Address("3263 Columbia Pike", "Arlington, VA 22204"), "(703) 746-0111",
                  Arrays.asList("Tier 1 Provider",  "Premium Care Physician","Accepting All Patients"),
                  "Audiology"));
          providers.add(new Provider(20,"Vigilias LLC" , "Internal Medicine", new Address("115 Park St SE Ste 205", "Vienna, VA 22180"), "(703) 255-9100",
                  Arrays.asList("Tier 1 Provider", "Accepting All Patients", "In-Network Provider"),
                  "Speech Pathology"));
          providers.add(new Provider(21,"Sara Nizam" , "Internal Medicine", new Address("38 E 32nd St Fl 3", "New York, NY 10016"), "(212) 879-7777",
                  Arrays.asList("Tier 1 Provider", "Premium Care Physician", "Accepting All Patients", "In-Network Provider"),
                  "Massage Therapist"));
          
          providers.add(new Provider(22,"Baringer" , "Internal Medicine", new Address("680 N Lake Shore Dr Ste ", "824 Chicago, IL 60611"), "(312) 943-3300",
                  Arrays.asList("Tier 1 Provider",  "Premium Care Physician","Accepting All Patients", "In-Network Provider"),
                  "Family Practice"));

        
        return providers;
    }
}
