package pl.sdaacademy.Spring.vod;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VodService {

    private final VodRepository vodRepository;

    public VodService(VodRepository vodRepository) {
        this.vodRepository = vodRepository;
    }

    public List<Series> getSeries(String title,
                                  String description,
                                  Integer seasonNumber,
                                  Integer episodeCount,
                                  Integer yearOfRelease) {
        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<Series> seriesExample = Example.of(
                new Series(title, description, seasonNumber, episodeCount, yearOfRelease),
                matcher);
        return vodRepository.findAll(seriesExample);
    }

    public Series getSeriesById(long id) {
        return vodRepository.findById(id).orElseThrow();
    }

    public Series deleteSeries(long id) {
        Series seriesToDelete = vodRepository.findById(id).orElseThrow();
        vodRepository.delete(seriesToDelete);
        return seriesToDelete;
    }

    public Series updateSeries(Series series) {
        Series seriesToUpdate = vodRepository.findById(series.getId()).orElseThrow();
        if (series.getTitle() != null) {
            seriesToUpdate.setTitle(series.getTitle());
        }
        if (series.getDescription() != null) {
            seriesToUpdate.setDescription(series.getDescription());
        }
        if (series.getSeasonNumber() != null) {
            seriesToUpdate.setSeasonNumber(series.getSeasonNumber());
        }
        if (series.getEpisodeCount() != null) {
            seriesToUpdate.setEpisodeCount(series.getEpisodeCount());
        }
        if (series.getYearOfRelease() != null) {
            seriesToUpdate.setYearOfRelease(series.getYearOfRelease());
        }
        return vodRepository.save(seriesToUpdate);
    }

    public Series addSeries(Series series) {
        series.setId(System.currentTimeMillis());
        return vodRepository.save(series);
    }
}

