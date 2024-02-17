package com.whitneykugel.PersonalLibrary.presentation.mapper;

import com.whitneykugel.PersonalLibrary.data.entity.Renter;
import com.whitneykugel.PersonalLibrary.presentation.dto.RenterDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface RenterMapper {

	RenterDto toRenterDto(Renter renter);

	List<RenterDto> toRenterDtoList(List<Renter> renterList);
}
