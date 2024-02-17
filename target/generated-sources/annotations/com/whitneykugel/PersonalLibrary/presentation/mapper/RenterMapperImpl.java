package com.whitneykugel.PersonalLibrary.presentation.mapper;

import com.whitneykugel.PersonalLibrary.data.entity.Renter;
import com.whitneykugel.PersonalLibrary.presentation.dto.RenterDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-17T14:07:02-0600",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class RenterMapperImpl implements RenterMapper {

    @Override
    public RenterDto toRenterDto(Renter renter) {
        if ( renter == null ) {
            return null;
        }

        RenterDto.RenterDtoBuilder renterDto = RenterDto.builder();

        renterDto.email( renter.getEmail() );
        renterDto.firstName( renter.getFirstName() );
        renterDto.lastName( renter.getLastName() );
        renterDto.dob( renter.getDob() );

        return renterDto.build();
    }

    @Override
    public List<RenterDto> toRenterDtoList(List<Renter> renterList) {
        if ( renterList == null ) {
            return null;
        }

        List<RenterDto> list = new ArrayList<RenterDto>( renterList.size() );
        for ( Renter renter : renterList ) {
            list.add( toRenterDto( renter ) );
        }

        return list;
    }
}
