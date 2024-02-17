package com.whitneykugel.PersonalLibrary.presentation.mapper;

import com.whitneykugel.PersonalLibrary.data.entity.Renter;
import com.whitneykugel.PersonalLibrary.presentation.dto.RenterDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RenterMapper {

	RenterDto toRenterDto(Renter renter);

	List<RenterDto> toRenterDtoList(List<Renter> renterList);
}
