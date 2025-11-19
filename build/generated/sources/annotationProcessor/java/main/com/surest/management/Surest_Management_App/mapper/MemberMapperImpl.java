package com.surest.management.Surest_Management_App.mapper;

import com.surest.management.Surest_Management_App.dto.MemberDto;
import com.surest.management.Surest_Management_App.entity.Member;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-19T12:20:33+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 17.0.17 (Microsoft)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public MemberDto toDto(Member m) {
        if ( m == null ) {
            return null;
        }

        MemberDto memberDto = new MemberDto();

        memberDto.id = m.getId();
        memberDto.firstName = m.getFirstName();
        memberDto.lastName = m.getLastName();
        memberDto.dateOfBirth = m.getDateOfBirth();
        memberDto.email = m.getEmail();
        memberDto.createdAt = m.getCreatedAt();
        memberDto.updatedAt = m.getUpdatedAt();

        return memberDto;
    }
}
