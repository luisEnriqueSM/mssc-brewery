package org.beer.works.msscbrewery.web.mappers;

import org.beer.works.msscbrewery.domain.Beer;
import org.beer.works.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
