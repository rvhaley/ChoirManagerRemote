package dk.cphbusiness.choir.contract;

import dk.cphbusiness.choir.contract.eto.NoSuchArtistException;
import dk.cphbusiness.choir.contract.dto.ArtistDetail;
import dk.cphbusiness.choir.contract.dto.MusicDetail;
import dk.cphbusiness.choir.contract.dto.ArtistSummary;
import dk.cphbusiness.choir.contract.eto.NoSuchMusicException;
import dk.cphbusiness.choir.contract.dto.MusicSummary;
import dk.cphbusiness.choir.contract.eto.NoSuchMaterialException;
import dk.cphbusiness.choir.contract.dto.MaterialDetail;
import dk.cphbusiness.choir.contract.dto.MaterialSummary;
import dk.cphbusiness.choir.contract.dto.VoiceSummary;
import dk.cphbusiness.choir.contract.dto.RoleSummary;
import dk.cphbusiness.choir.contract.dto.MemberDetail;
import dk.cphbusiness.choir.contract.eto.NoSuchMemberException;
import dk.cphbusiness.choir.contract.dto.MemberSummary;
import java.util.Collection;
import java.util.Map;
import javax.ejb.Remote;


@Remote
public interface ChoirManager {
  Map<Integer, VoiceSummary> mapVoices();
  Map<String, RoleSummary> mapRoles();
  
  Collection<VoiceSummary> listVoices();
  Collection<RoleSummary> listRoles();
  
  Collection<MemberSummary> listMembers();
  Collection<MemberSummary> listMembersByRole(String roleCode);
  Collection<MemberSummary> listMembersByVoices(int voiceCodes);
  
  MemberDetail findMember(long id) throws NoSuchMemberException;
  MemberDetail saveMember(MemberDetail member) throws NoSuchMemberException;
  
  Collection<MaterialSummary> listMaterials();
  Collection<MaterialSummary> listMaterialsByVoices(int voiceCodes);
  Collection<MaterialSummary> listMaterialsByMusic(long musicId) throws NoSuchMusicException;
  
  MaterialDetail findMaterial(long id) throws NoSuchMaterialException;
  MaterialDetail saveMaterial(MaterialDetail material) throws NoSuchMaterialException;
  
  Collection<MusicSummary> listMusic();
  Collection<MusicSummary> listMusicByComposer(long composerId);
  
  MusicDetail findMusic(long id) throws NoSuchMusicException;
  MusicDetail saveMusic(MusicDetail music) throws NoSuchMusicException;
  
  Collection<ArtistSummary> listArtists();
  Collection<ArtistSummary> listArtistsByPattern(String pattern);
  ArtistDetail findArtist(long id) throws NoSuchArtistException;
  ArtistDetail saveArtist(ArtistDetail artist);
  
  
  }
